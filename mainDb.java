//Apenas para Teste
public class mainDb{

    public static void main(String args[]){
        //Criacao da fabrica
        //Cada modulo deve colocar o nome do modulo (String) no construtor
        //Nesse caso seria o módulo "teste"
        DBFactory factory = new DBFactory("datas/teste");

        //Teste CSV
        //Retorna um vetor de string
        iDB objectDBCSV = factory.getDB(TypeDB.CSV);
        String[] csv = null;
        csv = objectDBCSV.getFromDB("Oi");

        System.out.println("Toda a linha do CSV que possua a palavra Oi:");
        System.out.println(csv[0] + ", " + csv[1] + ", " + csv[2] + ", " + csv[3] + ", " + csv[4] + '\n');

        //Teste TXT
        //Retorna uma unica string que contem todo o conteudo do arquivo
        iDB objectDBTXT = factory.getDB(TypeDB.TXT);
        String txt = null;
        txt = objectDBTXT.getFromDB();
        System.out.println("O arquivo em txt:");
        System.out.println(txt);

        //Teste XML
        //Deve salvar qualquer tipo de objeto e de recuperá-lo!
        iDB objectDBXML = factory.getDB(TypeDB.XML);
        //teste novoObjeto = new teste();
        //novoObjeto.cresce();
        //objectDBXML.saveDB(novoObjeto);
    }
}
