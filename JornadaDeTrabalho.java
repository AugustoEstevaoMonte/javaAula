import java.util.Scanner;

public class JornadaDeTrabalho
{
    public static void main(String[] args)
    {
        int weeklyJourney;
        double salaryPerHour,totalMoney;
        Scanner pd = new Scanner(System.in);
        try {
            System.out.println("Digite aqui quantas horas você trabalhou no mês: ");
            weeklyJourney = pd.nextInt();
            validateWeeklyJourney(weeklyJourney);
            System.out.println("Digite aqui o salário por hora recebido: ");
            salaryPerHour = pd.nextDouble();
            validateSalaryPerHour(salaryPerHour);
            totalMoney =  calculateAmountOfMoney(weeklyJourney,salaryPerHour);
            pd.close();
            System.out.printf("Você deve receber %.2f R$\n",totalMoney);
        }catch(Exception e){
            System.out.println(e);
        }

    }

    public static void validateWeeklyJourney(int weeklyJourney){
        if(weeklyJourney <0)
            throw new Error("Horas por mês inválidas!");
    }

    public static void validateSalaryPerHour(double salaryPerHour){
        if(salaryPerHour <0.0)
            throw new Error("Salário por hora recebido, inválido!");
    }

    public static double calculateIfFunctionaryWorksMoreLonger(int weeklyJourney, double salaryPerHour){
        if(weeklyJourney >40)
            return (salaryPerHour * 1.5);
        else
            return salaryPerHour;
    }


    public static double calculateAmountOfMoney(int weeklyJourney, double salaryPerHour)
    {
        salaryPerHour = calculateIfFunctionaryWorksMoreLonger(weeklyJourney,salaryPerHour);
        return (weeklyJourney*salaryPerHour);
    }

}
