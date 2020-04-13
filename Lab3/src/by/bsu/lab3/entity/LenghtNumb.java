package by.bsu.lab3.entity;

import by.bsu.lab3.exception.LenghtNumbException;

public class LenghtNumb {
    private  int lenght;
    private int numb;

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        try {


            if (validData(this.numb, lenght)) {
                this.lenght = lenght;
            } else {
                throw new LenghtNumbException("not correct data");
            }
        }
            catch(LenghtNumbException  e){
                System.out.println(e.getMessage());
            }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LenghtNumb{");
        sb.append("lenght=").append(lenght);
        sb.append(", numb=").append(numb);
        sb.append('}');
        return sb.toString();
    }

    public LenghtNumb(int lenght, int numb) {
        try {
            if(validData(numb, lenght)){
                this.lenght = lenght;
                this.numb = numb;
            }
            else{
                throw  new LenghtNumbException("not correct data");
            }

        }
        catch (LenghtNumbException e){
            System.out.println(e.getMessage());
        }
    }

    public void setNumb(int numb) {
        try {
            if(validData(numb,this.lenght)){
                this.numb = numb;

            }
            else {
                throw new LenghtNumbException("not correct data");
            }
        }
        catch (LenghtNumbException e){
            System.out.println(e.getMessage());
        }
    }
    public void setElement(int lenght, int numb){
        try {
            if(validData(numb, lenght)){
                this.lenght = lenght;
                this.numb = numb;
            }
            else{
                throw  new LenghtNumbException("not correct data");
            }

        }
        catch (LenghtNumbException e){
            System.out.println(e.getMessage());
        }
    }

    public int getNumb() {
        return numb;
    }
    private boolean validData(int n, int l){
        if(l==(Integer.toString(n)).length()){
            return true;
        }
        return false;
    }
}
