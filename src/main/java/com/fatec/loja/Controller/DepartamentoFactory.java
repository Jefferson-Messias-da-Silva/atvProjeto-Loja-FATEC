package com.fatec.loja.Controller;

class DepartamentoFactory extends Departamentos {
    @Override
    public PerfumariaFactory createdepartamento() {
        return new PerfumariaFactory();


    }}