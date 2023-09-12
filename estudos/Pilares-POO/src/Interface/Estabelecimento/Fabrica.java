package Interface.Estabelecimento;

import Interface.Equipamentos.Copiadora.Copiadora;
import Interface.Equipamentos.Digitalizadora.Digitalizadora;
import Interface.Equipamentos.Impressora.Deskjet;
import Interface.Equipamentos.Impressora.Impressora;
import Interface.Equipamentos.Impressora.Laserjet;
import Interface.Equipamentos.Mutifuncional.EquipamentoMultifunional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifunional em = new EquipamentoMultifunional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.Imprimir();
        digitalizadora.digitalizar();
        copiadora.Copiar();

    }

}
