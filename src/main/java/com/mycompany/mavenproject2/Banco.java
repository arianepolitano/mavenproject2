/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ariane
 */
class Banco {
    
    private static List<Empresa> lista = new ArrayList<>();

    public void add(Empresa empresa) {
        lista.add(empresa);
    }
    
    public List<Empresa> getEmpresas() {
        return lista;
    }
}
