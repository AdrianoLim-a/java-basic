package estabelecimento;

import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.copiadora.Copiadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.mutifuncional.EquipamentoMutifucional;

public class Fabrica {
	
	public static void main(String[] args) {
	
		EquipamentoMutifucional em = new EquipamentoMutifucional();
		
		Deskjet deskjet = new Deskjet();
		
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
		
	}

}
