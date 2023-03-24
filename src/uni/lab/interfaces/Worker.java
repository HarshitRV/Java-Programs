package src.uni.lab.interfaces;

import java.util.Scanner;

abstract class Worker {
    private String name;
    private String address;

    Worker(String name, String address) {
        this.name = name;
        this.address = address;
    }

    String getName() {
        return name;
    }

    String getAddress() {
        return address;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAddress(String address) {
        this.address = address;
    }

    abstract double earnings();
}

class PieceWorker extends Worker {
    private double wage;
    private int pieces;

    PieceWorker(String name, String address, double wage) {
        super(name, address);
        this.wage = wage;
        pieces = 0;
    }

    double getWage() {
        return wage;
    }

    double getPiecesMade() {
        return pieces;
    }

    void setPieces(int pieces) {
        this.pieces = pieces;
    }

    double earnings() {
        return wage * pieces;
    }
}

class PieceWorkerDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PieceWorker pieceWorker = new PieceWorker(sc.next(), sc.next(), sc.nextDouble());
        pieceWorker.setPieces(sc.nextInt());
        System.out.println(pieceWorker.earnings());

        sc.close();
    }
}