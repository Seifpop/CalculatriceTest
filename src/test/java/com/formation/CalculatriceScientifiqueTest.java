package com.formation;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CalculatriceScientifiqueTest {
    @Mock
    private ICalculette calculetteMock;

    private CalculatriceScientifique calculatriceScientifique;

    @BeforeEach
    public void setUp() {
        calculatriceScientifique = new CalculatriceScientifique(calculetteMock);
    }
    @Test
    void testCarre() {
        // Arrange
        int nombre = 5;
        when(calculetteMock.multiplier(nombre, nombre)).thenReturn(25);
        // Act
        int resultat = calculatriceScientifique.carre(nombre);
        // Assert
        assertEquals(25, resultat);
    }

}
