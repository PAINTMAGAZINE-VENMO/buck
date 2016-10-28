import java.util.Optional;
    assertEquals(absentRevision, Optional.empty());
    assertEquals(
        repoThreeCmdLine.commonAncestorOrAbsent(
            BRANCH_FROM_MASTER_THREE_BOOKMARK,
            "absent_bookmark"),
        Optional.empty());
  public void testTrackedBookmarksOffRevisionId()
      throws InterruptedException, VersionControlCommandFailedException {
    ImmutableMap<String, String> bookmarks = ImmutableMap.of("master2", "b1fd7e");
        repoThreeCmdLine.bookmarksRevisionsId(bookmarks.keySet()));
    bookmarks = ImmutableMap.of("master3", "d1");
        repoThreeCmdLine.bookmarksRevisionsId(bookmarks.keySet()));