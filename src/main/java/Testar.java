
import com.galaxy.model.Address;
import com.galaxy.model.AuthReturn;
import com.galaxy.model.BaseReturn;
import com.galaxy.model.Boleto;
import com.galaxy.model.Customer;
import com.galaxy.model.GerarPDF;
import com.galaxy.model.ParamsListagem;
import com.galaxy.model.PaymentMethodBoleto;
import com.galaxy.services.AuthService;
import com.galaxy.services.CobrancaService;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Renato
 */
public class Testar {

    public static void main(String[] args) throws Exception {
        AuthService auth = new AuthService();
        AuthReturn retorno = auth.Authentication();
//        CobrancaService cob = new CobrancaService(retorno);
//
//        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//
//        Address ad = new Address("38706321", "Maria da conceicao borges", "7500", "Centro", "Coromandel", "MG");
//
//        List<String> fones = new ArrayList();
//        List<String> emails = new ArrayList();
//        fones.add("34999753063");
//        emails.add("contato@emnail.com");
//        Customer customer = new Customer("9975", "Renato Goncalves dos Santos", "86076303859", emails, fones, ad);
////
//        Boleto bol = new Boleto(new BigDecimal(250), "Teste de informacoes", "a-999872", df.format(new Date()), Boolean.FALSE, customer, new BigDecimal(0.22), new BigDecimal(1), "Pagar ate");
//        try {
//            BaseReturn saida = cob.criar(bol);
//            System.out.println(saida);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        BaseReturn ret = cob.getPDF(new GerarPDF("a-999872"));
//        BaseReturn ret = cob.listar(params)
//        System.out.println(ret);
//        ParamsListagem param = new ParamsListagem();
//
//        param.setMyIds(Arrays.asList(new String[]{"a-999872"}));
//        
//        BaseReturn ret = cob.listar(param);
//        System.out.println(ret);
    }
}
