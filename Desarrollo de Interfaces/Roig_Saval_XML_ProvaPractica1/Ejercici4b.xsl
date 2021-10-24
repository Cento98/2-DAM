<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="RECETAS">
        <html>
            <head>

            </head>
            <body>
               <table border="1px">
                    <tr>
                        <td>
                            <xsl:for-each select="NOMBREPLATO/INGREDIENTS/PREPARACIO">
                                <xsl:if test="@dificultad='baixa' or @dificultad='mitja'">
                                    <xsl:value-of select="NOMBREPLATO/NOMBRE"></xsl:value-of>
                                </xsl:if>
                            </xsl:for-each>
                        </td>
                    </tr>
               </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>