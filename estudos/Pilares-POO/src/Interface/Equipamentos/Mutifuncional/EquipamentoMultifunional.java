package Interface.Equipamentos.Mutifuncional;

import Interface.Equipamentos.Copiadora.Copiadora;
import Interface.Equipamentos.Digitalizadora.Digitalizadora;
import Interface.Equipamentos.Impressora.Impressora;

public class EquipamentoMultifunional implements Copiadora, Digitalizadora, Impressora {

    public void Imprimir() {
        System.out.println("Imprimindo via Equipameto Multifuncional.");

    }

    public void digitalizar() {
        System.out.println("Digitalizando via Equipamento Multifuncional.");

    }

    public void Copiar() {
        System.out.println("Copiando via Equipamento Multifuncional.");

    }

}
