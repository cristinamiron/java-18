package homework1;

import inheritance.Shape;

import java.util.Arrays;

public class MainLibrary {
    public static void main(String[] args) {

    Library library=new Library();

    library.addToLibrary();
    library.deleteFromLibrary();
    library.listFromLibrary();

        Novel n1 = new Novel();
        n1.setNume("Nuvela 1");
        Novel n2 = new Novel();
        n2.setNume("Nuvela 2");
        ArtAlbum a1 = new ArtAlbum();
        a1.setNume("Album 1");
        ArtAlbum a2 = new ArtAlbum();
        a2.setNume("Album 2");

        Book[] listaCarti = new Book[4];
        listaCarti[0] = n1;
        listaCarti[1] = n2;
        listaCarti[2] = a1;
        listaCarti[3] = a2;

        for (Book elementLista : listaCarti) {
            System.out.println("Cartea se numeste: "+elementLista.getNume());
        }


        Library book1 = new Library();
        Library book2 = new Library();
        Library[] listaCarti1 = new Library[1];
        book1.addToLibrary();

        listaCarti1 = add(book1, listaCarti1);
        listaCarti1 = add(book2, listaCarti1);
    }
    // varianta 2- adaugare carte
    private static Library[] add(Library book1, Library[] arrayToAddLibrary) {

        Library[] newArray = Arrays.copyOf(arrayToAddLibrary, arrayToAddLibrary.length + 1);
        newArray[arrayToAddLibrary.length - 1] = book1;
        return newArray;
    }

    //pt delete- am gasit metoda "lista.remove(nr element din lista);", dar nu mi-a iesit in Intelij
}


