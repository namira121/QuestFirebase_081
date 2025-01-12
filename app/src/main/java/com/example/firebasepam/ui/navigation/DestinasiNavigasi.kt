package com.example.firebasepam.ui.navigation

interface DestinasiNavigasi{
    val route: String
    val titleRes: String
}

object DestinasiHome : DestinasiNavigasi{
    override val route: String = "home"
    override val titleRes: String = "Home"
}

object DestinsiInsert : DestinasiNavigasi{
    override val route: String = "insert"
    override val titleRes: String = "Insert"
}
