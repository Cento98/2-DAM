<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="PARTIDO">
        <html>
            <head>
                <body>
                    <xsl:for-each select="EQUIPO">
                        <table border="1">
                            <tr>
                                <td>
                                    <xsl:value-of select="ENTRENADOR"/>
                                </td>
                                <xsl:for-each select="JUGADOR">
                                    <td>
                                        <p><xsl:value-of select="."/></p>
                                        <p><xsl:value-of select="@dorsal"/></p>
                                        <p><xsl:value-of select="@titular"/></p>
                                    </td>
                                </xsl:for-each>
                            </tr>
                        </table>
                    </xsl:for-each>
                </body>
            </head>
        </html>
    </xsl:template>
</xsl:stylesheet>