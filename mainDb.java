//Apenas para Teste
public class mainDb{

    public static void main(String args[]){
        //Criacao da fabrica
        //Cada modulo deve colocar o nome do modulo (String) no construtor
        //Nesse caso seria o módulo "teste"
        DBFactory factory = new DBFactory("teste");

        /* ---- Teste CSV ---- */
        //Retorna um vetor de string
        iDB objectDBCSV = factory.getDB(TypeDB.CSV);
        String[] csv = null;
        try {
            csv = objectDBCSV.getFromDB("Oi");
        } catch (NullPointerException | NoMethod e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Toda a linha do CSV que possua a palavra Oi:");
        System.out.println(csv[0] + ", " + csv[1] + ", " + csv[2] + ", " + csv[3] + ", " + csv[4] + '\n');


        /* ---- Teste TXT ---- */
        //Retorna uma unica string que contem todo o conteudo do arquivo
        iDB objectDBTXT = factory.getDB(TypeDB.TXT);
        String txt = null;
        try {
			txt = objectDBTXT.getFromDB();
		} catch (NullPointerException | NoMethod e) {
			e.printStackTrace();
		}
        System.out.println("O arquivo em txt:");
        System.out.println(txt);


        /* ---- Testes XML ---- */
        //Deve salvar qualquer tipo de objeto e de recuperá-lo!
        iDB objectDBXML = factory.getDB(TypeDB.XML);
        ObjectForTestsPurposeOnly primeiroObjeto = new ObjectForTestsPurposeOnly();
        ObjectForTestsPurposeOnly segundoObjeto = null;

        primeiroObjeto.cresce();
        primeiroObjeto.cresce();
        primeiroObjeto.cresce();
        //Salva o primeiro objeto no arquivo
        try {
            objectDBXML.saveDB(primeiroObjeto);
		} catch (NullPointerException | NoMethod e) {
			e.printStackTrace();
		}
        //Resgata o objeto 1 e salva em 2
        try {
            segundoObjeto = (ObjectForTestsPurposeOnly)objectDBXML.getObject();
		} catch (NullPointerException | NoMethod e) {
			e.printStackTrace();
		}

        System.out.println( segundoObjeto.getIdade() );
    }
}
