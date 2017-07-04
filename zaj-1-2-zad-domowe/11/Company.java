package com.tomek.zadaniadomowe;

public class Company {
    private String name;
    private String address;
    private String nip;
    private int numberOfEmployees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public String toString() {
        return "Firma " + name + ", " +
                "dzialajaca pod adresem: " + address + ", " +
                "identyfikujaca sie numerem nip: " + nip + ", " +
                "zatrudnia " + numberOfEmployees + " pracownikow";
    }
}
