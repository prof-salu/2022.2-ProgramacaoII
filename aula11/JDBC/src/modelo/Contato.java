package modelo;

import java.time.LocalDate;

/**
 *
 * @author aluno
 */

public class Contato {
    private long codigo;
    private String nome;
    private String tel;
    private String email;
    private LocalDate dtNasc;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(LocalDate dtNasc) {
        this.dtNasc = dtNasc;
    }

    @Override
    public String toString() {
        return "Contato{" + "codigo=" + codigo + ", nome=" + nome + ", tel=" + tel + ", email=" + email + ", dtNasc=" + dtNasc + '}';
    }
}
