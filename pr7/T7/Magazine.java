package pr7.T7;

public class Magazine {
    public static void printJournals(Printable[] printable) {
        for (Printable p: printable) {
            if(p.getClass() == Journal.class) {
                p.print();
            }
        }
    }

    public static void printBooks(Printable[] printable) {
        for (Printable p: printable) {
            if(p.getClass() == Book.class) {
                p.print();
            }
        }
    }

    public static void main(String[] args){

        Printable[] array = new Printable[10];
        {
            array[0] = new Book("glory hall", "Steve Pops", 1988);
            array[1] = new Journal("Flopa diy", 2025);
            array[2] = new Book("mans show", "guy poorly", 1999);
            array[3] = new Book("Breaking good", "HBA", 2012);
            array[4] = new Book("game of chairs", "pin ci lin", 2005);
            array[5] = new Book("biblia", "Jesus", 0);
            array[6] = new Book("physics", "Newton", 1800);
            array[7] = new Journal("Beuty", 2021);
            array[8] = new Journal("Sports", 2018);
            array[9] = new Journal("cooking", 2024);
        }

        System.out.println("Books:");
        printBooks(array);
        System.out.println("Journals:");
        printJournals(array);
    }

}
