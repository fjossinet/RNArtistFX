package io.github.fjossinet.rnartist.rnartistfx

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class RNArtistFX : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(RNArtistFX::class.java.getResource("rnartistfx.fxml"))
        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)
        stage.title = "RNArtistFX!"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(RNArtistFX::class.java)
}