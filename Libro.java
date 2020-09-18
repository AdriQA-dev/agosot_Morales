package Practico5;

public class Libro {
    //atributos
    private int ISBN;
    private String Titulo;
    private String Autor;
    private int NumerodePaginas;
    //constructores
    //Constructor sin parametros
    public Libro() {

        this.Titulo = "Sin titulo";

    }
    //constructor con parametros
    public Libro(int ISBN,String Titulo,String Autor,int NumerodePaginas){
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor  = Autor;
        this.NumerodePaginas = NumerodePaginas;
    }

    //metodos
    public void setISBN(int ISBN){
       this.ISBN = ISBN;
    }

    public int getISBN(){
        return this.ISBN;
    }


    public void setTitulo(String Titulo) {
       this.Titulo = Titulo;
    }
    public String  getTitulo(){



        return this.Titulo;

    }

    public void setAutor(String Autor){
        this.Autor = Autor;
    }

    public String getAutor(){

        if(this.Autor.isEmpty()) {
            return "desconocido";
        }
        return this.Autor;
    }

    public void setNumerodePaginas(int NumerodePaginas) {
       this.NumerodePaginas = NumerodePaginas;
    }
    public int getNumerodePaginas(){
        return this.NumerodePaginas;
    }

    @Override
    public String toString() {
        return "El Libro con{" +
                "ISBN=" + this.getISBN() +
                ",que tiene el  Titulo='" + this.getTitulo() + '\'' +
                ",creado por el  Autor='" + this.getAutor() + '\'' +
                ", y tiene NumerodePaginas=" + this.getNumerodePaginas() +
                '}';
    }


}
