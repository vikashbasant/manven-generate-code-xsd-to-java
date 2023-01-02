package com.soap.manven.generatecodexsdtojava;

import com.soap.maven.xsd2java.ObjectFactory;
import com.soap.maven.xsd2java.Subject;

import javax.xml.bind.JAXBElement;
import java.io.Serializable;
import java.util.List;

public class Runner {

    public static void main(String[] args){
        final ObjectFactory factory = new ObjectFactory ();
        final Subject.Principals sub = factory.createSubjectPrincipals ();
        sub.setKey ("session");
        sub.setValue ("12345");

        String key = sub.getKey ();
        String value = sub.getValue ();
        System.out.println (key + " " + value);


        final JAXBElement<String> key1 = factory.createSubjectCredentialsKey ("user");
        final JAXBElement<String> value1 = factory.createSubjectCredentialsValue ("87878");

        final Subject.Credentials cre = factory.createSubjectCredentials ();
        List<Serializable> content = cre.getContent ();

        System.out.println (content);


//        final JAXBElement<String> user = factory.createSubjectCredentialsKey ("user");
//        final JAXBElement<String> pass = factory.createSubjectCredentialsValue ("sdkfdkfj");
//
//






    }
}
