package br.com.textiltbm.msg

import br.com.sankhya.extensions.actionbutton.AcaoRotinaJava
import br.com.sankhya.extensions.actionbutton.ContextoAcao
import br.com.textiltbm.framework.FrameWorkAbstract

class MensagemGroovy implements AcaoRotinaJava{


	@Override
	public void doAction(ContextoAcao contextoacao) throws Exception {
		
		FrameWorkAbstract restEnd = new FrameWorkAbstract();
		
		contextoacao.setMensagemRetorno("Endere�o �:"+restEnd.buscarEndereco("60115-000"));
		
	}
	
	
	
	

}
