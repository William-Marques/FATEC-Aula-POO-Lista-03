import javax.swing.JOptionPane;





/*
2) Um programa que imprima até o “n” termo a seqüência de Fibonacci. Série: 1,1,2,3,5,8,13,21.......
Por exemplo, imprimir até o 6º termo: 1, 1, 2, 3, 5, 8

class Main {

  static long fibo(int n) {
    if (n < 2) {
      return n;
    } else {
      return fibo(n - 1) + fibo(n - 2);
    }
  }

  public static void main(String[] args) {

    String input;
    input = JOptionPane.showInputDialog("Digite quantos termos Fibonacci deseja");
    int valor1 = Integer.parseInt(input);
    String msg = " ";

    try {
      if (valor1 <= 0) {
        throw new Exception();
      }
      for (int i = 0; i < valor1; i++) {
        msg += Main.fibo(i + 1) + " ";
      }
      JOptionPane.showMessageDialog(null, "Sequência de Fibonacci até o " + valor1 + "º termo:" + msg);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "O valor deve ser maior que 0!");
    }

  }
}
*/
/*
 * /*1) Um programa capaz de imprimir todos os números pares em um intervalo de
 * números informador pelo usuário;
 * 
 * 
 * class Main {
 * 
 * public static void main(String[] args) { String input; input =
 * JOptionPane.showInputDialog("Digite o valor inicial"); int valor1 =
 * Integer.parseInt(input); input =
 * JOptionPane.showInputDialog("Digite o valor final"); int valor2 =
 * Integer.parseInt(input); String msg = " "; try{ if(valor1 > valor2){ throw
 * new Exception(); } for(int c = valor1; c <= valor2; c++){ if(c%2==0){ msg +=
 * " " + c; } } JOptionPane.showMessageDialog(null,
 * "Números pares no intervalo informado:" + msg); } catch(Exception e){
 * JOptionPane.showMessageDialog(null,
 * "O valor inicial deve ser menor do que o valor final!"); } } }
 */

/*
 * EXEMPLO DE TRY E CATCH
 * 
 * static void teste(){ String A,B; int x, y, c; try{
 * A=JOptionPane.showInputDialog(null, "Digite o valor de x: ");
 * x=Integer.parseInt(A); B=JOptionPane.showInputDialog(null,
 * "Digite o valor de y: "); y=Integer.parseInt(B);
 * 
 * c=x/y; JOptionPane.showMessageDialog(null, x + " divido por " + y + " = " +
 * c); } catch(ArithmeticException e){ JOptionPane.showMessageDialog(null,
 * "Não pode ser dividido por 0");
 * 
 * 
 * } finally{ JOptionPane.showMessageDialog(null, "Encerrrando"); teste(); } }
 * 
 * public static void main(String[] args) { teste(); }
 * 
 * }
 */