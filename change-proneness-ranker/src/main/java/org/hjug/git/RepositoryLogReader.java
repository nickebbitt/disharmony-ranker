package org.hjug.git;

import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.Repository;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public interface RepositoryLogReader {

    Repository gitRepository(File basedir) throws IOException;

    Map<String, ByteArrayOutputStream> listRepositoryContentsAtHEAD(Repository repository) throws IOException;

    ScmLogInfo fileLog(Repository repository, String path) throws GitAPIException, IOException;

    TreeMap<Integer, Integer> captureChangCountByCommitTimestamp(Repository repository) throws IOException, GitAPIException;
}
