import javax.swing.JOptionPane;
public class TesteTurma {
   public static void main(String[] args) {
   
      String nome = JOptionPane.showInputDialog("Nome");
      String curso = JOptionPane.showInputDialog("Curso");
      int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Alunos"));
      int serie = Integer.parseInt(JOptionPane.showInputDialog("Serie"));
   
      Turma peca = new Turma(nome, curso, quantidadeDeAlunos, serie);
      
      String msg = "Nome: " + peca.getNome() + "\nCurso: "
         + peca.getCurso() + "\nQuantidade: " + peca.getQuantidadeDeAlunos()
         + " Alunos" + "\nSerie: " + peca.getSerie();
   
      JOptionPane.showMessageDialog(null, msg);
      
      quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Nova Quantidade de Alunos"));
      peca.setQuantidadeDeAlunos(quantidadeDeAlunos);
      msg = "Nome: " + peca.getNome() + "\nCurso: "
         + peca.getCurso() + "\nQuantidade: " 
         + peca.getQuantidadeDeAlunos() + " Alunos" + "\nSerie: " 
         + peca.getSerie();
         
      JOptionPane.showMessageDialog(null, msg);
   }
}