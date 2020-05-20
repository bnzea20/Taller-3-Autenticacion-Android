package com.example.interfaces;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class ObtenerUsuarioBaseDatos extends StringRequest {
    private static final String ruta="http://alimapp.com/obtener_usuario.php";
    private Map<String,String> parametros;
    public ObtenerUsuarioBaseDatos(String correo, Response.Listener<String> listener){
        super(Request.Method.POST,ruta,listener,null);
        parametros=new HashMap<>();
        parametros.put("correo",correo);
    }

    @Override
    protected Map<String, String> getParams(){
        return parametros;
    }
}
