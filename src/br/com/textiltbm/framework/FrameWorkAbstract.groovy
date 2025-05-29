package br.com.textiltbm.framework

class FrameWorkAbstract {
	
	def divisao(def a, def b){
		return a/b;
	}
	
	
	def somat(def a,def b){
		
		return a+b
		
	}
	
	def subtracao(def a, def b){
		
		return a-b
	}
	
	
	def buscarEndereco(def cep) {
		
		def get = new URL("https://viacep.com.br/ws/"+cep+"/json/").openConnection();
		def getRC = get.getResponseCode();
		println(getRC);
		if (getRC.equals(200)) {
			
			return get.getInputStream().getText();
									
		}else{
			return "Erro ao buscar o endereco!"
		}
		
		
	}

}
