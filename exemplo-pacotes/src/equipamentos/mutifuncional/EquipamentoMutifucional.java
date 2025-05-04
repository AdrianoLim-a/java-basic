package equipamentos.mutifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMutifucional implements Copiadora, Impressora, Digitalizadora  {

	@Override
	public void digitalizar() {
		// TODO Auto-generated method stub
		System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MUTIFUNCIONAL");
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.println("IMPRINDO VIA EQUIPAMENTO MUTIFUNCIONAL");
	}

	@Override
	public void copiar() {
		// TODO Auto-generated method stub
		System.out.println("COPIANDO VIA EQUIPAMENTO MUTIFUNCIONAL");
	}
	

}
