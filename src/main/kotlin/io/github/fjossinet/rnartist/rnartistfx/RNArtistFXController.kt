package io.github.fjossinet.rnartist.rnartistfx

import javafx.fxml.FXML
import javafx.scene.control.Label

class RNArtistFXController {
    @FXML
    private lateinit var welcomeText: Label

    @FXML
    private fun onHelloButtonClick() {
        welcomeText.text = "Welcome to RNArtistFX!"
    }
}