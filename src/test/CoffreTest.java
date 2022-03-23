package test;

import static org.junit.Assert.*;

import main.Coffre;
import main.I_CoffreChateau;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CoffreTest {
	
	private I_CoffreChateau coffre;

	@Before
	public void setUp() throws Exception {
		coffre = new Coffre();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAuDemarrage() {
		assertEquals("Cache",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

	@Test
	public void testApresAvoirOteLeLivreDeLaBibliotheque() {
		coffre.oterLivre();
		assertEquals("Ferme",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}
	
	@Test
	public void testApresAvoirRemisLeLivreDansLaBibliothequeSansAvoirTouchePrealablementALaChandelle() {
		coffre.oterLivre();
		coffre.remettreLivre();
		assertEquals("Cache",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

	@Test
	public void testApresAvoirRemisLeLivreDansLaBibliothequeEnAyantTouchePrealablementALaChandelle() {
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.remettreLivre();
		assertEquals("Cache",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

	@Test
	public void testApresAvoirOteLeLivreDeLaBibliothequeEtTourneChandelleVersLaDroite() {
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		assertEquals("PresqueOuvert",coffre.nomEtat());
		assertTrue(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

	@Test
	public void testApresAvoirOteLeLivreDeLaBibliothequeEtTourneChandelleVersLaDroiteDeuxFois() {
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersDroite();
		assertEquals("Ouvert",coffre.nomEtat());
		assertTrue(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

	@Test
	public void testApresAvoirOteLeLivreDeLaBibliothequeEtTourneChandelleVersLaDroiteDeuxFoisPuisFermeLeCoffre() {
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersDroite();
		coffre.fermerCoffre();
		assertEquals("Ferme",coffre.nomEtat());
		assertTrue(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

	@Test
	public void testApresAvoirOteLeLivreDeLaBibliothequeEtTourneChandelleVersLaGauche() {
		coffre.oterLivre();
		coffre.tournerChandelleVersGauche();
		assertEquals("Bloque",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertTrue(coffre.lapinEstLibere());
	}

	@Test
	public void testApresAvoirOteLeLivreDeLaBibliothequeEtTourneChandelleVersLaDroitePuisGauche() {
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersGauche();
		assertEquals("Bloque",coffre.nomEtat());
		assertTrue(coffre.chienEstLibere());
		assertTrue(coffre.lapinEstLibere());
	}


}
