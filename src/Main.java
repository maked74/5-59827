//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main()
{
    String N3;
    String F3;
    int F2; int F2max = 0;
    for (int N2 = 1; N2 < 100; N2++)
    {
        N3 = Integer.toString(N2, 3);

        if (N2 % 3 == 0)
        {
            F3 =  N3.concat(N3.substring(N3.length() - 2));
        }
        else
        {
            F3 = N3.concat(Integer.toString((N2 % 3) * 5, 3));
        }
        F2 = Integer.parseInt(F3, 3);

        if (F2 > F2max && F2 < 173) F2max = F2;

        IO.print(N2);
        IO.print(" ");
        IO.print(N3);
        IO.print(" ");
        IO.print(F3);
        IO.print(" ");
        IO.println(F2);

    }
    IO.println(F2max);

}
