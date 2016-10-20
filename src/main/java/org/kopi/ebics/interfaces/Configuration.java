/*
 * Copyright (c) 1990-2012 kopiLeft Development SARL, Bizerte, Tunisia
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1 as published by the Free Software Foundation.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 * $Id$
 */

package org.kopi.ebics.interfaces;

import java.util.Locale;


/**
 * EBICS client application configuration.
 *
 * @author hachani
 *
 */
public interface Configuration {

  /**
   * Returns the property value of a given key from
   * the configuration file
   * @param key the given key
   * @return the property value
   */
  public String getProperty(String key);


  /**
   * Returns the SSL trusted store directory.
   * @return the SSL trusted store directory.
   */
  //public String getSSLTrustedStoreDirectory();

  /**
   * Return the SSL key store directory
   * @return the SSL key store directory
   */
  //public String getSSLKeyStoreDirectory();

  /**
   * Returns the SSL bank server certificates.
   * @return the SSL bank server certificates.
   */
  //public String getSSLBankCertificates();


  /**
   * Returns the Ebics client serialization manager.
   * @return the Ebics client serialization manager.
   */
  public SerializationManager getSerializationManager();

  /**
   * Returns the Ebics client trace manager.
   * @return the Ebics client trace manager.
   */
  public TraceManager getTraceManager();

  /**
   * Returns the letter manager.
   * @return the letter manager.
   */
  public LetterManager getLetterManager();


  /**
   * Returns the client application logger.
   * @return the client application logger.
   */
  public EbicsLogger getLogger();

  /**
   * Configuration initialization.
   * Creates the necessary directories for the ebics configuration.
   */
  public void init();

  /**
   * Returns the application locale.
   * @return the application locale.
   */
  public Locale getLocale();

  /**
   * Returns the client application signature version
   * @return the signature version
   */
  public String getSignatureVersion();

  /**
   * Returns the client application authentication version
   * @return the authentication version
   */
  public String getAuthenticationVersion();

  /**
   * Returns the client application encryption version
   * @return the encryption version
   */
  public String getEncryptionVersion();

  /**
   * Tells if the client application should keep XML transfer
   * files in the transfer log directory
   * @return True if the client application should not delete
   *         the XML transfer files
   */
  public boolean isTraceEnabled();

  /**
   * Returns if the files to be transferred should be
   * compressed or sent without compression. This can
   * affect the time of data upload especially for big
   * files
   *
   * @return true if the file compression is enabled
   */
  public boolean isCompressionEnabled();

  /**
   * Returns the default revision of sent XML.
   * @return the default revision of sent XML.
   */
  public int getRevision();

  /**
   * Returns the version of the EBICS protocol used by the client.
   * @return the version of the EBICS protocol.
   */
  public String getVersion();
}
