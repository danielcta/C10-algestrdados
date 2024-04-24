import javax.swing.JOptionPane;

public class C10EX07 
{
    public static void main(String[] args) 
    {
        double populacao, populacaoContaminada = 1, dias = 0, anos = 0, meses = 0;
        populacao = Long.parseLong(JOptionPane.showInputDialog(null, 
        "Qual a população total da cidade?",
        "Exercício 07",
        JOptionPane.QUESTION_MESSAGE));

        do
        {            

            populacaoContaminada += populacao * (0.3/100);
            dias++;

            if (dias == 30)
            {
                meses++;
                dias = 0;
            }
            if (meses == 12) 
            {
                anos++;
                meses = 0;
            } 
   
        } while (populacaoContaminada <= populacao);
        System.out.printf("Anos = %f Meses = %f Dias = %f", anos, meses, dias);
    }
}
