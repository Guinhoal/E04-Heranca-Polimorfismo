import java.util.Date;
    public class OperacaoDeposito extends Operacao {
        public OperacaoDeposito(double valor) {
            super('d', valor);
            setTipo('d');
            setValor(valor);
        }
    }

