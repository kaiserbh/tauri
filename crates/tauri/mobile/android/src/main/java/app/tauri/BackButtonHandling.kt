// Copyright 2019-2024 Tauri Programme within The Commons Conservancy
// SPDX-License-Identifier: Apache-2.0
// SPDX-License-Identifier: MIT

package app.tauri

/**
 * Implemented by the activity to choose whether Tauri handles the back button.
 */
interface BackButtonHandling {
  /**
   * When false, Tauri registers no back callback, so the app handles back itself
   * and Android can play its predictive back-to-home animation.
   */
  val handleBackButton: Boolean
}
