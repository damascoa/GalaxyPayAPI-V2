/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.galaxy.services;

import com.galaxy.config.Constantes;
import com.galaxy.model.AuthReturn;
import com.galaxy.model.BaseReturn;
import com.galaxy.model.Boleto;
import com.galaxy.model.ParamsListagem;
import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import java.util.Arrays;
import java.util.HashMap;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

/**
 *
 * @author Renato
 */
public class CobrancaService {

    private AuthReturn authReturn;

    public CobrancaService(AuthReturn authReturn) {
        this.authReturn = authReturn;
    }

    public BaseReturn listar(ParamsListagem params) throws Exception {
        HttpResponse<BaseReturn> saida = Unirest.get(params.gerarParametrosURI())
                .header("Authorization", authReturn.getToken_type() + " " + authReturn.getAccess_token()).asObject(BaseReturn.class);
        switch (saida.getStatus()) {
            case 200:
                return saida.getBody();
            case 400:
                tratarErroValidacao(saida);
            case 401:
                //Falha ao autenticar.
                throw new Exception("Falha ao autenticar.");
            case 403:
                throw new Exception("Validação de segurança.");
            case 404:
                //Cliente não encontrado.
                throw new Exception("Nenhuma cobrança avulsa encontrada com os parâmetros utilizados.");
            default:
                //ERRO NAO CATALOGADO
                throw new Exception("Erro não catalogado.");
        }
    }

    public BaseReturn criar(Boleto bol) throws Exception {

        HttpResponse<String> saida = Unirest.post("https://api.galaxpay.com.br/v2/charges")
                .header("Authorization", authReturn.getToken_type() + " " + authReturn.getAccess_token())
                .header("Content-Type", "application/json")
                .body(bol)
                .asString();

        System.out.println("STATUS: " + saida.getStatus());

        System.out.println(saida);

        switch (saida.getStatus()) {
            case 200:
                return new Gson().fromJson(saida.getBody(), BaseReturn.class);
            case 400:
                System.out.println("TRATANDO ERROS? ");
                System.out.println(saida);
                StringBuilder sb = new StringBuilder();

                BaseReturn saida2 = new Gson().fromJson(saida.getBody(), BaseReturn.class);

                sb.append(saida2.getError().getMessage()).append("\n");
                if (saida2.getError().getDetails() != null) {
                    LinkedTreeMap hmap = (LinkedTreeMap) saida2.getError().getDetails();
                    hmap.forEach((k, v) -> {
                        sb.append(k).append(" : ").append(v).append("\n");
                    });
                }
                throw new Exception(sb.toString());
            case 401:
                //Falha ao autenticar.
                throw new Exception("Falha ao autenticar.");
            case 403:
                throw new Exception("Validação de segurança.");
            case 404:
                //Cliente não encontrado.
                throw new Exception("Cliente não encontrado.");
            default:
                //ERRO NAO CATALOGADO
                throw new Exception("Erro não catalogado.");
        }

    }

    private void tratarErroValidacao(HttpResponse<BaseReturn> saida) throws Exception {
        //Erros de validação.
        System.out.println("TRATANDO ERROS? ");
        System.out.println(saida);
        StringBuilder sb = new StringBuilder();
        sb.append(saida.getBody().getError().getMessage()).append("\n");
        if (saida.getBody().getError().getDetails() != null) {
            LinkedTreeMap hmap = (LinkedTreeMap) saida.getBody().getError().getDetails();
            hmap.forEach((k, v) -> {
                sb.append(k).append(" : ").append(v).append("\n");
            });
        }
        throw new Exception(sb.toString());
    }

    public void editar() {

    }

    public BaseReturn excluir(String myId) throws Exception {
        HttpResponse<BaseReturn> saida = Unirest.delete("https://api.galaxpay.com.br/v2/charges/1/" + myId)
                .header("Authorization", authReturn.getToken_type() + " " + authReturn.getAccess_token())
                .asObject(BaseReturn.class);

        switch (saida.getStatus()) {
            case 200:
                return saida.getBody();
            case 400:
                tratarErroValidacao(saida);
            case 401:
                //Falha ao autenticar.
                throw new Exception("Falha ao autenticar.");
            case 403:
                throw new Exception("Validação de segurança.");
            case 404:
                //Cliente não encontrado.
                throw new Exception("Não encontrado.");
            default:
                //ERRO NAO CATALOGADO
                throw new Exception("Erro não catalogado.");
        }
    }

    public BaseReturn getCarne(String[] myIds) throws Exception {
        HttpResponse<String> response = Unirest.post("https://api.galaxpay.com.br/v2/carnes/onePDF")
                .header("Authorization", authReturn.getToken_type() + " " + authReturn.getAccess_token())
                .header("Content-Type", "application/json")
                .body("{subscriptionsMyIds: " + Arrays.toString(myIds) + " }")
                .asString();
        switch (response.getStatus()) {
            case 200:
                return new Gson().fromJson(response.getBody(), BaseReturn.class);
            case 400:
                BaseReturn saida = new Gson().fromJson(response.getBody(), BaseReturn.class);
                StringBuilder sb = new StringBuilder();
                sb.append(saida.getError().getMessage()).append("\n");
                if (saida.getError().getDetails() != null) {
                    LinkedTreeMap hmap = (LinkedTreeMap) saida.getError().getDetails();
                    hmap.forEach((k, v) -> {
                        sb.append(k).append(" : ").append(v).append("\n");
                    });
                }
                throw new Exception(sb.toString());
            case 401:
                //Falha ao autenticar.
                throw new Exception("Falha ao autenticar.");
            case 403:
                throw new Exception("Validação de segurança.");
            case 404:
                //Cliente não encontrado.
                throw new Exception("Assinatura não encontrada.");
            default:
                //ERRO NAO CATALOGADO
                throw new Exception("Erro não catalogado.");
        }
    }

    public BaseReturn getPDF(String[] myIds) throws Exception {
        HttpResponse<String> response = Unirest.post("https://api.galaxpay.com.br/v2/boletos")
                .header("Authorization", authReturn.getToken_type() + " " + authReturn.getAccess_token())
                .header("Content-Type", "application/json")
                .body("{transactionsMyIds: " + Arrays.toString(myIds) + " }")
                .asString();

        switch (response.getStatus()) {
            case 200:
                return new Gson().fromJson(response.getBody(), BaseReturn.class);
            case 400:
                BaseReturn saida = new Gson().fromJson(response.getBody(), BaseReturn.class);
                StringBuilder sb = new StringBuilder();
                sb.append(saida.getError().getMessage()).append("\n");
                if (saida.getError().getDetails() != null) {
                    LinkedTreeMap hmap = (LinkedTreeMap) saida.getError().getDetails();
                    hmap.forEach((k, v) -> {
                        sb.append(k).append(" : ").append(v).append("\n");
                    });
                }
                throw new Exception(sb.toString());
            case 401:
                //Falha ao autenticar.
                throw new Exception("Falha ao autenticar.");
            case 403:
                throw new Exception("Validação de segurança.");
            case 404:
                //Cliente não encontrado.
                throw new Exception("Transação não encontrada..");
            default:
                //ERRO NAO CATALOGADO
                throw new Exception("Erro não catalogado.");
        }
    }
}
