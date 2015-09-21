package com.nigel.utils;

import java.io.File;
import java.io.IOException;

import org.tmatesoft.svn.core.SVNDepth;
import org.tmatesoft.svn.core.SVNException;
import org.tmatesoft.svn.core.SVNURL;
import org.tmatesoft.svn.core.auth.ISVNAuthenticationManager;
import org.tmatesoft.svn.core.internal.io.dav.DAVRepositoryFactory;
import org.tmatesoft.svn.core.internal.io.fs.FSRepositoryFactory;
import org.tmatesoft.svn.core.internal.io.svn.SVNRepositoryFactoryImpl;
import org.tmatesoft.svn.core.io.SVNRepository;
import org.tmatesoft.svn.core.io.SVNRepositoryFactory;
import org.tmatesoft.svn.core.wc.SVNClientManager;
import org.tmatesoft.svn.core.wc.SVNRevision;
import org.tmatesoft.svn.core.wc.SVNUpdateClient;
import org.tmatesoft.svn.core.wc.SVNWCClient;
import org.tmatesoft.svn.core.wc.SVNWCUtil;

public class SVNUtil
{
  private String svnRoot;

  private String userName;

  private String password;

  private SVNRepository repository;

  public SVNUtil(String svnRoot)
  {

    this.svnRoot = svnRoot;

  }

  public SVNUtil(String svnRoot, String userName, String password)
  {

    this.svnRoot = svnRoot;

    this.userName = userName;

    this.password = password;

  }

  private static void setupLibrary()
  {

    DAVRepositoryFactory.setup();

    SVNRepositoryFactoryImpl.setup();

    FSRepositoryFactory.setup();

  }

  public boolean login()
  {

    setupLibrary();

    try
    {

      repository = SVNRepositoryFactory.create(SVNURL.parseURIEncoded(this.svnRoot));

      ISVNAuthenticationManager authManager = SVNWCUtil.createDefaultAuthenticationManager(this.userName, this.password);

      repository.setAuthenticationManager(authManager);

      // System.out.println("HEAD revision: "+repository.getLatestRevision());
      // repository.checkout(repository.getLatestRevision(), "res", true, null);

      return true;

    }
    catch (SVNException svne)
    {

      svne.printStackTrace();

      return false;

    }

  }

  public boolean co() throws SVNException, IOException
  {
    SVNClientManager ourClientManager = SVNClientManager.newInstance(null, repository.getAuthenticationManager());
    SVNUpdateClient svnuc = ourClientManager.getUpdateClient();
    svnuc.setIgnoreExternals(false);
    File local = new File("D:\\Temp\\c0");
    SVNWCClient svnwc = ourClientManager.getWCClient();
    svnwc.setIgnoreExternals(false);
    // svnwc.doRevert(local, true);
    svnwc.doRevert(new File[] { local.getCanonicalFile() }, SVNDepth.INFINITY, null);
    svnuc.doUpdate(local, SVNRevision.HEAD, SVNDepth.INFINITY, true, true);
    // updateClient.doCheckout(SVNURL.parseURIEncoded(svnRoot), file,
    // SVNRevision.HEAD, SVNRevision.HEAD, SVNDepth.INFINITY, false);
    // .doCheckout(this.svnRoot, dstPath, pegRevision, revision, depth,
    // allowUnversionedObstructions);
    // .doCheckout(this.svnRoot, new File("D:\\Temp\\co"),SVNRevision.HEAD,
    // SVNRevision.HEAD, true);
    return false;
  }

  public static void main(String[] args) throws SVNException, IOException
  {
    String user = "nigel.zheng";// "jenkins";
    String pass = "ni9el@07";// "Welcome1";
    SVNUtil svn = new SVNUtil("https://10.161.92.105/svn/oxygen/branches/SiteSupervisor1_04/Func/src/main/res", user, pass);
    System.out.println("login: " + svn.login());
    svn.co();
    System.out.println("Done!");
  }
}
