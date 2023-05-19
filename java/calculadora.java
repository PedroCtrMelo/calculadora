public class calculadora {
    private int numeroUM;
    private int numeroDOIS;
    private int operacao;



    public  void setNumeroUM(int novoValorNumeroUm)
    {
        numeroUM = novoValorNumeroUm;
    }
    public void setNumeroDOIS(int novoValorNumeroDois)
    {
        numeroDOIS = novoValorNumeroDois;
    }
    public  void setOperacao(int novoValorOperacao)
    {
        numeroUM = novoValorOperacao;
    }

    public int somar()
    {
     return numeroUM + numeroDOIS;
    }
    
    public double subtrair()
    {
     return numeroUM - numeroDOIS;
    }
    public double multiplicar()
    {
     return numeroUM * numeroDOIS;
    }

    public double dividir()
    {
     return numeroUM / numeroDOIS;
    }
    public double potencia()
    {
        return Math.pow(numeroUM, numeroDOIS);
    }

    public double raiz()
    {
        Math.sqrt(numeroUM);
      
        return numeroUM;
    }
}
