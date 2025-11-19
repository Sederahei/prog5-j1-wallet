package dev.sedera;

import java.util.ArrayList;
import java.util.List;

public class Portefeuille {
    private String couleur;
    private int porteCarte;
    private double poids;
    private String marque;
    private double argent;
    private List<String> cartes;

    public Portefeuille(String couleur, int porteCarte, double poids, String marque) {
        this.couleur = couleur;
        this.porteCarte = porteCarte;
        this.poids = poids;
        this.marque = marque;
        this.argent = 0.0;
        this.cartes = new ArrayList<>();
    }

    public void addMoney(double montant) {
        if (montant > 0) {
            argent += montant;
        }
    }

    public boolean getMoney(double montant) {
        if (montant > 0 && montant <= argent) {
            argent -= montant;
            return true;
        }
        return false;
    }

    public double checkMoney() {
        return argent;
    }

    public boolean addCard(String carte) {
        if (cartes.size() < porteCarte) {
            cartes.add(carte);
            return true;
        }
        return false;
    }

    public void lost() {
        argent = 0.0;
        cartes.clear();
    }

    @Override
    public String toString() {
        return "Portefeuille{" +
                "couleur='" + couleur + '\'' +
                ", porteCarte=" + porteCarte +
                ", poids=" + poids +
                ", marque='" + marque + '\'' +
                ", argent=" + argent +
                ", cartes=" + cartes +
                '}';
    }
}

