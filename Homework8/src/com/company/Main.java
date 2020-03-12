package com.company;

public class Main {

    public static void main(String[] args) {
	Company a = new Company(); // Pahanjum A and B a, bayc en ory asiq vor objectneri anuny mecatarov chdnem
	Company b = new Company(); // nenc vor iranq menak sout-um en A and B ( im vra el azdecin eli kesic mecatarery )
	Person aram = new Person();
	    aram.name = "Aram";
	    aram.balance = 500;
	    aram.company = a;
	Person erik = new Person();
        erik.name = "Erik";
        erik.company = a;
        erik.balance = 500;
	Person art = new Person();
        art.name = "Art";
        art.company = a;
        art.balance = 500;
	Person hovo = new Person();
        hovo.name = "Hovo";
        hovo.company = b;
	    hovo.balance = 500;
	Person miqo = new Person();
        miqo.name = "Miqo";
        miqo.company = b;
        miqo.balance = 500;
	Person garik = new Person();
        garik.name = "Garik";
        garik.company = b;
        garik.balance = 500;
        garik.sendMoney(miqo, 200);
        aram.sendMoney(erik, 300);
        aram.sendMoney(art, 100);
        hovo.sendMoney(aram, 300);
        erik.sendMoney(hovo, 150);
        Person[] persons = new Person[] {aram, erik, art, hovo, miqo, garik};
        Person theRichestOne = persons[0];
        Company[] companies = new Company[] {a, b};
        Company theRichestCompany = companies[0];
            for (int i = 0; i < persons.length; i++) {
                if (theRichestOne.balance < persons[i].balance)
                    theRichestOne = persons[i];
                if (persons[i].company == a)
                    a.balance = a.balance + persons[i].balance;
                else
                    b.balance = b.balance + persons[i].balance;
                System.out.print(persons[i].name + " " + persons[i].balance + "  ");
            } // Ste company-neri hamar array chem sarqel, vorovhetev petq chekav, ete inch - greq sarqem
        System.out.println();
        System.out.println(theRichestOne.name + " " + theRichestOne.balance + "  ");
        if (a.balance > b.balance)
            System.out.println("A company is the richest");
        else if (a.balance < b.balance)
            System.out.println("B company is the richest");
        else
            System.out.println("They have equal balances");
    }
}
