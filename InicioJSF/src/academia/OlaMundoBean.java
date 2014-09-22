package academia;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class OlaMundoBean {
	
	private String nome;
	
	public String digaOi() {
		return nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHorario() {
	    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
	    return "Atualizado em " + sdf.format(new Date());
	  }
}
