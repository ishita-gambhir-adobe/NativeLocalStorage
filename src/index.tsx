import NativeLocalStorage from './NativeNativeLocalStorage';

export function multiply(a: number, b: number): number {
  return NativeLocalStorage.multiply(a, b);
}

export async function extensionVersion(): Promise<string> {
  return await NativeLocalStorage.extensionVersion();
}
