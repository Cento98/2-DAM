<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head>
                <link rel="steelsheet" href="Restaurante.css"/>
            </head>
            <body>
                <div id="Titulo"><h1>Restaurante</h1></div>
                <div id="Titulo2"><h4>Menus:</h4></div>
                <br></br>
                <div id="Menus">
                    <xsl:for-each select="RESTAURANTE/MENU">
                        <p>Menu</p>
                        <p><xsl:value-of select="PRIMERO"/></p>
                        <p><xsl:value-of select="SEGUNDO"/></p>
                        <p><xsl:value-of select="TERCERO"/></p>
                    </xsl:for-each>
                </div>


            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>