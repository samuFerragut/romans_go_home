package org.foobarspam.KataRomanNumerals;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumeroRomano {

    private String numeroRomano = null;
    private short numeroDecimal = 0;
    private RegexNumerosRomanos regexDiccionario = new RegexNumerosRomanos();



    public NumeroRomano() {
    };

    public NumeroRomano(String numeroRomano) {
        this.numeroRomano = numeroRomano;
    }
    /** Getters y setters */
    public void setNumeroRomano(String numeroRomano) {
        this.numeroRomano = numeroRomano;
        this.setNumeroDecimal((short) 0);
    }

    public String getNumeroRomano() {
        return this.numeroRomano;
    }

    public void setNumeroDecimal(short numeroDecimal) {
        this.numeroDecimal = numeroDecimal;
    }

    public short getNumeroDecimal() {
        return this.numeroDecimal;
    }

    public void setRegexDiccionario(RegexNumerosRomanos regex) {
        this.regexDiccionario = regex;
    }

    public RegexNumerosRomanos getRegexDiccionario() {
        return this.regexDiccionario;
    }

    public void initRegexDicionario() {
        getRegexDiccionario().addRegex("grupoSumatorio", "(?<!C)[DM]|(?<!X)[LC](?![DM])|(?<!I)[VX](?![LC])|I(?![VX])");
    }
}
