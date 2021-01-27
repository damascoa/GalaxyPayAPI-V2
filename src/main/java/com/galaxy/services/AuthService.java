/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.galaxy.services;

import com.galaxy.config.Constantes;
import com.galaxy.model.AuthReturn;
import java.util.Base64;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

/**
 *
 * @author Renato
 */
public class AuthService {

    private String jsonAuth = "{\n"
            + "    \"grant_type\": \"authorization_code\",\n"
            + "    \"scope\": \"transactions.read transactions.write webhooks.write charges.read charges.write boletos.read carnes.read\"\n"
            + "}";

    public AuthReturn Authentication() throws Exception {
        HttpResponse<AuthReturn> saida = Unirest.post(Constantes.urlBase + "token")
                .header("Authorization", "Basic " + Base64.getEncoder().encodeToString((Constantes.galaxId + ":" + Constantes.galaxHash).getBytes("utf-8")))
                .header("Content-Type", "application/json")
                .body(jsonAuth).asObject(AuthReturn.class);
        System.out.println("AUTH: " + "Basic " + Base64.getEncoder().encodeToString((Constantes.galaxId + ":" + Constantes.galaxHash).getBytes("utf-8")));
        System.out.println("TOKEN: " + saida.getBody().getAccess_token());
        switch (saida.getStatus()) {
            case 200:
                return saida.getBody();
            case 400:
                throw new Exception("Erros de validação.");
            case 401:
                throw new Exception("Falha ao autenticar.");
            default:
                throw new Exception("Validação de segurança.");
        }
    }
}
