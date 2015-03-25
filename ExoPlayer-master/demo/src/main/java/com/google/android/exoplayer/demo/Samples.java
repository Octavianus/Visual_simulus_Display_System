/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.android.exoplayer.demo;

import java.util.Locale;

/**
 * Holds statically defined sample definitions.
 */
/* package */ class Samples {

  public static class Sample {

    public final String name;
    public final String contentId;
    public final String uri;
    public final int type;

    public Sample(String name, String uri, int type) {
      this(name, name.toLowerCase(Locale.US).replaceAll("\\s", ""), uri, type);
    }

    public Sample(String name, String contentId, String uri, int type) {
      this.name = name;
      this.contentId = contentId;
      this.uri = uri;
      this.type = type;
    }

  }

  public static final Sample[] YOUTUBE_DASH_MP4 = new Sample[] {
    new Sample("instance1",
        "http://www.youtube.com/api/manifest/dash/id/bf5bb2419360daf1/source/youtube?"
        + "as=fmp4_audio_clear,fmp4_sd_hd_clear&sparams=ip,ipbits,expire,as&ip=0.0.0.0&"
        + "ipbits=0&expire=19000000000&signature=255F6B3C07C753C88708C07EA31B7A1A10703C8D."
        + "2D6A28B21F921D0B245CDCF36F7EB54A2B5ABFC2&key=ik0", DemoUtil.TYPE_DASH),
    new Sample("instance2",
        "http://www.youtube.com/api/manifest/dash/id/3aa39fa2cc27967f/source/youtube?"
        + "as=fmp4_audio_clear,fmp4_sd_hd_clear&sparams=ip,ipbits,expire,as&ip=0.0.0.0&ipbits=0&"
        + "expire=19000000000&signature=7181C59D0252B285D593E1B61D985D5B7C98DE2A."
        + "5B445837F55A40E0F28AACAA047982E372D177E2&key=ik0", DemoUtil.TYPE_DASH),
  };

  public static final Sample[] YOUTUBE_DASH_WEBM = new Sample[] {
    new Sample("instance1",
        "http://www.youtube.com/api/manifest/dash/id/bf5bb2419360daf1/source/youtube?"
        + "as=fmp4_audio_clear,webm2_sd_hd_clear&sparams=ip,ipbits,expire,as&ip=0.0.0.0&ipbits=0&"
        + "expire=19000000000&signature=A3EC7EE53ABE601B357F7CAB8B54AD0702CA85A7."
        + "446E9C38E47E3EDAF39E0163C390FF83A7944918&key=ik0", DemoUtil.TYPE_DASH),
      };

  public static final Sample[] SMOOTHSTREAMING = new Sample[] {
    new Sample("instance1",
        "http://playready.directtaps.net/smoothstreaming/SSWSS720H264/SuperSpeedway_720.ism",
        DemoUtil.TYPE_SS),
  };

  public static final Sample[] WIDEVINE_GTS = new Sample[] {
    new Sample("instance1", "d286538032258a1c",
        "http://www.youtube.com/api/manifest/dash/id/d286538032258a1c/source/youtube?"
        + "as=fmp4_audio_cenc,fmp4_sd_hd_cenc&sparams=ip,ipbits,expire,as&ip=0.0.0.0&ipbits=0"
        + "&expire=19000000000&signature=41EA40A027A125A16292E0A5E3277A3B5FA9B938."
        + "0BB075C396FFDDC97E526E8F77DC26FF9667D0D6&key=ik0", DemoUtil.TYPE_DASH),

  };

  public static final Sample[] HLS = new Sample[] {
    new Sample("instance1",
        "https://devimages.apple.com.edgekey.net/streaming/examples/bipbop_4x3/"
        + "bipbop_4x3_variant.m3u8", DemoUtil.TYPE_HLS),

  };

  public static final Sample[] MISC = new Sample[] {
    new Sample("instance1", "http://html5demos.com/assets/dizzy.mp4",
        DemoUtil.TYPE_OTHER),

  };

  private Samples() {}

}
