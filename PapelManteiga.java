import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PapelManteiga {
    public static String leTXT() {
        String arquivo = "";
        try {
            FileReader arq = new FileReader("papelzito.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            String str = lerArq.readLine();
            while (str != null) {
                //System.out.printf("%s\n", str);
                arquivo += str + ",";
                str = lerArq.readLine();
            }
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo!");
        }
        return arquivo;
    }
    public static ArrayList<Integer> getIntArray(ArrayList<String> stringArray) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(String stringValue : stringArray) {
            try {
                result.add(Integer.parseInt(stringValue));
            } catch(NumberFormatException nfe) {
               System.out.println("Could not parse " + nfe);
            } 
        }       
        return result;
    }
    public static void main(String[] args) {
        String coordenadas = leTXT();
        List<String> list = Arrays.asList(coordenadas.split(","));
        ArrayList<String> list2 = new ArrayList<String>(list);
        ArrayList<Integer> result = getIntArray(list2);
        int[][] papelmanteiga = new int[895][1311];

        for (int i=0;i<result.size()-1;i+=2) {
            papelmanteiga[result.get(i+1)][result.get(i)] += 1;
        }
        
        //dobra no x
        for (int i=0;i<papelmanteiga.length;i++) {
            for (int j=656;j<papelmanteiga[0].length;j++) {
                if (papelmanteiga[i][j]>0) {
                    int co = Math.abs((j+1)-1311);
                    papelmanteiga[i][co] += 1;
                    papelmanteiga[i][j] = 0;
                }
            }
        }

        //dobra no y
        for (int i=447;i<papelmanteiga.length;i++){
            for (int j=0;j<papelmanteiga[0].length;j++) {
                if (papelmanteiga[i][j]>0) {
                    int li = Math.abs((i+1)-895);
                    papelmanteiga[li][j] += 1;
                    papelmanteiga[i][j] = 0;
                }
            }
        }

        //dobra no x
        for (int i=0;i<papelmanteiga.length;i++) {
            for (int j=328;j<papelmanteiga[0].length;j++) {
                if (papelmanteiga[i][j]>0) {
                    int co = Math.abs((j+1)-655);
                    papelmanteiga[i][co] += 1;
                    papelmanteiga[i][j] = 0;
                }
            }
        }

        //dobra no y
        for (int i=223;i<papelmanteiga.length;i++){
            for (int j=0;j<papelmanteiga[0].length;j++) {
                if (papelmanteiga[i][j]>0) {
                    int li = Math.abs((i+1)-447);
                    papelmanteiga[li][j] += 1;
                    papelmanteiga[i][j] = 0;
                }
            }
        }

        //dobra no x
        for (int i=0;i<papelmanteiga.length;i++) {
            for (int j=164;j<papelmanteiga[0].length;j++) {
                if (papelmanteiga[i][j]>0) {
                    int co = Math.abs((j+1)-327);
                    papelmanteiga[i][co] += 1;
                    papelmanteiga[i][j] = 0;
                }
            }
        }

        //dobra no y
        for (int i=111;i<papelmanteiga.length;i++){
            for (int j=0;j<papelmanteiga[0].length;j++) {
                if (papelmanteiga[i][j]>0) {
                    int li = Math.abs((i+1)-223);
                    papelmanteiga[li][j] += 1;
                    papelmanteiga[i][j] = 0;
                }
            }
        }

        //dobra no x
        for (int i=0;i<papelmanteiga.length;i++) {
            for (int j=82;j<papelmanteiga[0].length;j++) {
                if (papelmanteiga[i][j]>0) {
                    int co = Math.abs((j+1)-163);
                    papelmanteiga[i][co] += 1;
                    papelmanteiga[i][j] = 0;
                }
            }
        }

        //dobra no y
        for (int i=55;i<papelmanteiga.length;i++){
            for (int j=0;j<papelmanteiga[0].length;j++) {
                if (papelmanteiga[i][j]>0) {
                    int li = Math.abs((i+1)-111);
                    papelmanteiga[li][j] += 1;
                    papelmanteiga[i][j] = 0;
                }
            }
        }

        //dobra no x
        for (int i=0;i<papelmanteiga.length;i++) {
            for (int j=41;j<papelmanteiga[0].length;j++) {
                if (papelmanteiga[i][j]>0) {
                    int co = Math.abs((j+1)-81);
                    papelmanteiga[i][co] += 1;
                    papelmanteiga[i][j] = 0;
                }
            }
        }

        //dobra no y
        for (int i=27;i<papelmanteiga.length;i++){
            for (int j=0;j<papelmanteiga[0].length;j++) {
                if (papelmanteiga[i][j]>0) {
                    int li = Math.abs((i+1)-55);
                    papelmanteiga[li][j] += 1;
                    papelmanteiga[i][j] = 0;
                }
            }
        }

        //dobra no y
        for (int i=13;i<papelmanteiga.length;i++){
            for (int j=0;j<papelmanteiga[0].length;j++) {
                if (papelmanteiga[i][j]>0) {
                    int li = Math.abs((i+1)-27);
                    papelmanteiga[li][j] += 1;
                    papelmanteiga[i][j] = 0;
                }
            }
        }

        //dobra no y
        for (int i=6;i<papelmanteiga.length;i++){
            for (int j=0;j<papelmanteiga[0].length;j++) {
                if (papelmanteiga[i][j]>0) {
                    int li = Math.abs((i+1)-13);
                    papelmanteiga[li][j] += 1;
                    papelmanteiga[i][j] = 0;
                }
            }
        }

        char[][] resposta = new char[8][45];
        for (int i=0;i<resposta.length;i++) {
            for (int j=0;j<resposta[0].length;j++) {
                if (papelmanteiga[i][j]>0) {
                    resposta[i][j] = '#';
                }
                else resposta[i][j] = '.';
            }
        }

        for (int i=0;i<resposta.length;i++) {
            for (int j=0;j<resposta[0].length;j++) {
                System.out.print(resposta[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
