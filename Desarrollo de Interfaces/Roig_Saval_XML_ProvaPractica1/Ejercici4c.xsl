<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="RECETAS">
        <html>
            <head>

            </head>
            <body>
                <xsl:for-each select="NOMBREPLATO">
                    <table border="1px">
                        <tr>
                            <td>
                                <xsl:value-of select="NOMBRE"/>
                            </td>
                            <xsl:for-each select="INGREDIENT">
                                <td>
                                    <xsl:value-of select="NOM"/>
                                    <xsl:value-of select="QUANTITAT"/>
                                    <xsl:value-of select="QUANTITAT/@mesurat"/>
                                </td>
                            </xsl:for-each>
                            <td>
                                <xsl:value-of select="PREPARACIO"/>
                                <xsl:value-of select="PREPARACIO/@dificultat"/>
                                <xsl:value-of select="PREPARACIO/@temps_forn"/>
                                <xsl:value-of select="PREPARACIO/@temperatura_forn"/>
                            </td>
                            <td>
                                <xsl:value-of select="TEMPS"/>
                            </td>
                        </tr>
                    </table>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>