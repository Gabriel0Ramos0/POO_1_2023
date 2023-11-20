package sistema_bancário_herança_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContaTest {
	
	Conta origem;
	Conta destino;
	Caixa caixa;
	Conta universitaria;
	Conta especial;
	
	@BeforeEach
	void executaAntes() {
		origem = new Conta();
		origem.setSaldo(100);
		origem.setNumero(123);
		origem.setAgencia(456);
		origem.setCliente("Cliente 1");
		
		destino = new Conta(100, 100, "A", 100);
		
		universitaria = new Conta_Universitária(1,1,"U",100);
		especial = new Conta_Especial(2,2,"E", 100, 0);
	}
	
	@Test
    void construtorEspecialTest() {
        Conta_Especial instancia = new Conta_Especial();
    }
	
	@Test
    void construtorUniversitariaTest() {
        Conta_Universitária instancia = new Conta_Universitária();
    }
	
	@Test
    void construtorCaixaTest() {
        Caixa instancia = new Caixa();
    }

	@Test 
	void depositoTest() {
		assertTrue(origem.deposito(100));
		assertEquals(200, origem.getSaldo());
	}
	
	@Test
	void saquePossivelTest() {
		assertTrue(origem.saque(50));
		assertEquals(50, origem.getSaldo());
	}
	@Test
	void saqueImpossivelTest() {
		assertFalse(origem.saque(200));
		assertEquals(100, origem.getSaldo());
	}
	
	@Test
	void toStringTest() {
		assertEquals("A", destino.getCliente());
		assertEquals(456, origem.getAgencia());
		assertEquals("100-A- R$100.0\n", destino.toString());
	}
	
	@Test
	void toStringEspecialTest() {
		if (especial instanceof Conta_Especial) {
	        Conta_Especial contaEspecial = (Conta_Especial) especial;
	        contaEspecial.setLimite(100);
	    }
	    assertEquals("E", especial.getCliente());
	    assertEquals(2, especial.getAgencia());
	    assertEquals("Conta_Especial limite=100.0", especial.toString());
	}

	
	@Test
	void TransferenciaPossivelTest() {
		assertTrue(origem.transferencia(destino, 50));
		assertEquals(50, origem.getSaldo());
		assertEquals(150, destino.getSaldo());
	}
	
	@Test
	void TransferenciaImpossivelTest() {
		assertFalse(origem.transferencia(destino, 200));
		assertEquals(100, origem.getSaldo());
		assertEquals(100, destino.getSaldo());
	}
	
	@Test
	void TransferenciaContaUniversitariaFail() {
		origem.setSaldo(5000);
		assertFalse(origem.transferencia(universitaria, 4000));
		assertEquals(5000, origem.getSaldo());
		assertEquals(100, universitaria.getSaldo());
	}
	
	@Test
	public void UniversitariaSaqueSuficienteTest() {
		universitaria.deposito(100);
		assertTrue(universitaria.saque(100));
		assertEquals(100, universitaria.getSaldo());
	}

	@Test
	public void UniversitariaSaqueInsuficienteTest() {
		universitaria.deposito(30);
		assertFalse(universitaria.saque(150));
		assertEquals(130, universitaria.getSaldo());
	}
	    
	@Test
	public void EspecialSaqueSuficienteTest() {
		especial.deposito(100);
		assertTrue(especial.saque(100));
		assertEquals(100, especial.getSaldo());
	}

	@Test
	public void EspecialSaqueInsuficienteTest() {
		especial.deposito(50);
		assertFalse(especial.saque(300));
		assertEquals(150, especial.getSaldo());
	}
	
	@Test
	public void CaixaDepositarTest() {
	    assertTrue(Caixa.depositar(origem, 100));
	    assertEquals(200, origem.getSaldo());
	}

	@Test
	public void CaixaSacarTest() {
	    origem.deposito(150);
	    assertTrue(Caixa.sacar(origem, 50));
	    assertEquals(200, origem.getSaldo());
	}

	@Test
	public void CaixaTransferirTest() {
	    origem.deposito(100);
	    assertTrue(Caixa.trasferir(origem, destino, 100));
	    assertEquals(100, origem.getSaldo());
	    assertEquals(200, destino.getSaldo());
	}

}

