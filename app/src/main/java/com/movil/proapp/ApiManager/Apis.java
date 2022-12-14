package com.movil.proapp.ApiManager;

public class Apis {
    public static final String URL="https://bobsburgers-api.herokuapp.com/";

    public static PersonaService getPersonaService(){
        return  Cliente.getClient(URL).create(PersonaService.class);
    }
}
