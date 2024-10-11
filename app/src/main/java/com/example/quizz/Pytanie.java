package com.example.quizz;

public class Pytanie {
    private String tresc;
    private boolean poprawnaOdpowiedz;
    private String podpowiedz;
    private boolean czyOdpowiedzianoPoprawnie;

    public Pytanie(String tresc, boolean poprawnaOdpowiedz, String podpowiedz) {
        this.tresc = tresc;
        this.poprawnaOdpowiedz = poprawnaOdpowiedz;
        this.podpowiedz = podpowiedz;
        czyOdpowiedzianoPoprawnie = false;

    }

    public void setCzyOdpowiedzianoPoprawnie(boolean czyOdpowiedzianoPoprawnie) {
        this.czyOdpowiedzianoPoprawnie = czyOdpowiedzianoPoprawnie;
    }

    public String getTresc() {
        return tresc;
    }

    public boolean isPoprawnaOdpowiedz() {
        return poprawnaOdpowiedz;
    }

    public String getPodpowiedz() {
        return podpowiedz;
    }

    public boolean isCzyOdpowiedzianoPoprawnie() {
        return czyOdpowiedzianoPoprawnie;
    }
}
