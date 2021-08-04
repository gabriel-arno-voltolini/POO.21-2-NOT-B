
/**
 * Escreva a descrição da classe Desenhista aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Desenhista
{
    public void desenharCarinha()
    {
        desenharRosto();
        desenharOlhos();
        desenharNariz();
        desenharBoca();
    }

    private void desenharRosto()
    {
        Circle rosto = new Circle();
        //rosto.diameter = -1000;
        rosto.changeSize(150);
        rosto.makeVisible();
        rosto.changeColor("blue");
        rosto.moveHorizontal(-10);
    }

    private void desenharOlhos()
    {
        Circle olhoEsquerdo = new Circle();
        olhoEsquerdo.changeSize(30);
        olhoEsquerdo.makeVisible();
        olhoEsquerdo.changeColor("green");
        olhoEsquerdo.moveDown();
        olhoEsquerdo.moveRight();

        Circle olhoDireito = new Circle();
        olhoDireito.changeSize(30);
        olhoDireito.makeVisible();
        olhoDireito.changeColor("green");
        olhoDireito.moveDown();
        olhoDireito.moveRight();
        olhoDireito.moveRight();
        olhoDireito.moveRight();
        olhoDireito.moveRight();
    }

    private void desenharNariz()
    {
        Triangle nariz = new Triangle();
        nariz.makeVisible();
        nariz.changeSize(30, 30);
        nariz.changeColor("black");
        nariz.moveDown();
        nariz.moveDown();
        nariz.moveDown();
        nariz.moveDown();
        nariz.moveDown();
        nariz.moveRight();
        nariz.moveRight();
    }

    private void desenharBoca()
    {
        Square boca = new Square();
        boca.makeVisible();
        boca.changeColor("red");
        boca.changeSize(25);
        boca.moveDown();
        boca.moveDown();
        boca.moveDown();
        boca.moveDown();
        boca.moveDown();
        boca.moveRight();
    }
}
