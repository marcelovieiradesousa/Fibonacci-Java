import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static void main(String[] args) {
    List<Integer> fibo = new ArrayList<>();
    int numDesejado = 34;
    int indexAux1 = 0;
    int indexAux2 = 1;

    fibo.add(0);
    fibo.add(1);

    while (true) {
      int soma = 0;

      if (fibo.contains(numDesejado)) {
        System.out.println("Numero pertence a sequência");
        break;
      } else if (numDesejado < Collections.max(fibo)) {
        System.out.println("Numero não pertence a sequência");
        break;
      }

      soma = fibo.get(indexAux1) + fibo.get(indexAux2);
      fibo.add(soma);

      indexAux1++;
      indexAux2++;
    }

  }
