public class Cliente {
    String nomeCompleto;
    int mesa;

    public Cliente(String nomeCompleto, int mesa) {
        this.nomeCompleto = nomeCompleto;
        this.mesa = mesa;
    }

    String getPrimeiroNome() {
        return nomeCompleto.split(" ")[0];
    }

    String nomeMaiusculo(String nomeCompleto) {
        return nomeCompleto.toUpperCase();
    }
}
